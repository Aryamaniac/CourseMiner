import scrapy
import re

class CourseSpider(scrapy.Spider):
    
    name = 'courseScraper'
    #start_urls = ['https://bulletin.uga.edu/MinorDisplay/1', 'https://bulletin.uga.edu/MinorDisplay/4', 'https://bulletin.uga.edu/MinorDisplay/5', 'https://bulletin.uga.edu/MinorDisplay/6', 'https://bulletin.uga.edu/MinorDisplay/105', 'https://bulletin.uga.edu/MinorDisplay/9', 'https://bulletin.uga.edu/MinorDisplay/12', 'https://bulletin.uga.edu/MinorDisplay/15', 'https://bulletin.uga.edu/MinorDisplay/111', 'https://bulletin.uga.edu/MinorDisplay/16', 'https://bulletin.uga.edu/MinorDisplay/25', 'https://bulletin.uga.edu/MinorDisplay/26', 'https://bulletin.uga.edu/MinorDisplay/27', 'https://bulletin.uga.edu/MinorDisplay/28', 'https://bulletin.uga.edu/MinorDisplay/36', 'https://bulletin.uga.edu/MinorDisplay/38', 'https://bulletin.uga.edu/MinorDisplay/42', 'https://bulletin.uga.edu/MinorDisplay/43', 'https://bulletin.uga.edu/MinorDisplay/44', 'https://bulletin.uga.edu/MinorDisplay/46', 'https://bulletin.uga.edu/MinorDisplay/53', 'https://bulletin.uga.edu/MinorDisplay/58', 'https://bulletin.uga.edu/MinorDisplay/61', 'https://bulletin.uga.edu/MinorDisplay/63', 'https://bulletin.uga.edu/MinorDisplay/65', 'https://bulletin.uga.edu/MinorDisplay/69', 'https://bulletin.uga.edu/MinorDisplay/72', 'https://bulletin.uga.edu/MinorDisplay/107', 'https://bulletin.uga.edu/MinorDisplay/73', 'https://bulletin.uga.edu/MinorDisplay/74', 'https://bulletin.uga.edu/MinorDisplay/76', 'https://bulletin.uga.edu/MinorDisplay/77', 'https://bulletin.uga.edu/MinorDisplay/79', 'https://bulletin.uga.edu/MinorDisplay/84', 'https://bulletin.uga.edu/MinorDisplay/87', 'https://bulletin.uga.edu/MinorDisplay/88', 'https://bulletin.uga.edu/MinorDisplay/89', 'https://bulletin.uga.edu/MinorDisplay/109', 'https://bulletin.uga.edu/MinorDisplay/93', 'https://bulletin.uga.edu/MinorDisplay/110', 'https://bulletin.uga.edu/MinorDisplay/102', 'https://bulletin.uga.edu/MinorDisplay/104']
    start_urls = ['https://bulletin.uga.edu/MinorDisplay/104']

    def parse(self, response):
        
        minors = response.css('div')
        tableMinors = minors.css('table')
        allCID = tableMinors.css('a::attr(cid)').getall()
        allName = tableMinors.css('a::text').getall()

        '''
        for i in range(len(allName)):
            if '/' in allName[i]:
                allName[i] = allName[i][0:allName[i].find('/')]

        allClasses = []
        dict = {}

        for i in range(len(allName)):
            dict[allName[i]] = [allCID[i]]
        '''

        numRequired = 9

        requiredMin = 9
        requiredMax = 9

        electiveMin = 6
        electiveMax = 6

        required = allCID[0:numRequired]
        elective = allCID[numRequired:]
        big = minors.css('span.labelText').get()
        title = big[big.find('<h3>Minor - ') + 12:big.find('</h3>')]
        totalHoursString = big[big.find('TOTAL HOURS: ') + 13 : big.find('For more information') - 13]
        totalHours = int(big[big.find('TOTAL HOURS: ') + 13:big.find('TOTAL HOURS: ') + 15])
        #totalHours = big[big.find('TOTAL HOURS: ') + 13:big.find('TOTAL HOURS: ') + 15]

        '''        
        print("#################################################################################")
        print("Title:")
        print(title)

        print("Required:")
        print(required)

        print("Elective:")
        print(elective)

        print("Total Hours:")
        print(totalHours)
        print("#################################################################################")
        ''' 
        '''
        print("#################################################################################")

        print('allName = ')
        print(allName)

        print("allCID")
        print(allCID)

        print(len(allCID))
        print(len(allName))


        print("#################################################################################")
        '''
        
        yield {

            'Name' : title,
            'Total Hours' : totalHours,
            'Required' : required,
            'Elective' : elective,
            'requiredMin' : requiredMin,
            'requiredMax' : requiredMax,
            'electiveMin' : electiveMin,
            'electiveMax' : electiveMax

        }
        
        #yield dict



