public class StudentInfo { // corrected class name

    String sem[]={"1stsem", "2ndsem", "3rdsem"};
    double marks[]={9.14,9.07,9.07};

    public void stud_info(){
        System.out.print("\nGrade obtained from the semester\n");
        for(int i=0; i<3;i++){
            System.out.println(sem[i]+":Grade:"+marks[i]);
        }
    }

   
}

