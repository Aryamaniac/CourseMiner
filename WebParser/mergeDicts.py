import json


def Merge(dict1, dict2):
    return(dict2.update(dict1))


def main():
    f = open('cidList.json')
 
    # returns JSON object as
    # a dictionary
    data = json.load(f)
    dict = {}
    for i in range(len(data)):
        dict.update(data[i])

    with open('classesDict.txt','w') as data:
        data.write(str(dict))

if __name__ == '__main__':
    main()

