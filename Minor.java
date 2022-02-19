public class Minor {
   
    int totalHours;
    int remainingHours;
    String name;
    Course required[] = new Course[10];
    Course optionals[] = new Course[10];
    int requiredSize = 0;
    int optionalSize = 0;
    int minRequiredHours;
    int maxRequiredHours;
    int optionalHours; 

    public void requiredAppend(Course c){
        //Insert code to expand array if needed?
        required[requiredSize] = c;
        requiredSize++;
    } // requiredAppend
    

    
}
