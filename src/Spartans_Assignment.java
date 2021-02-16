public class Spartans_Assignment extends Assignment{
    String batchName;

    @Override
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;

    }

    @Override
    public void setAssignmentLink(String link) {
        this.assignmentLink = link;

    }

    @Override
    public void setAssignmentPassword(String password) {
this.assignmentPassword = password;
    }

    @Override
    public void setnoOfQuestions(int noOfQuestions) {
this.noOfQuestions= noOfQuestions;
    }
    public void setBatchName(String batchName){
        this.batchName = batchName;
    }
    public void display(){
        System.out.println("The Assignment Name is "+assignmentName);
        System.out.println("The Assignment Link is "+assignmentLink);
        System.out.println("The Assignment Password is "+assignmentPassword);
        System.out.println("Total number of questions are "+noOfQuestions);
        System.out.println("Batch Name is "+batchName);
    }
}
