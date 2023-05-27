package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math,int science[],int[] english) {
        if (math.length == 0 || science.length == 0 || english.length == 0) {
            return null;
        }
        int totalMarks[] = new int[math.length];
        for (int i = 0; i < math.length; i++) {
            totalMarks[i] = (math[i] + science[i] + english[i]);
        }
        return totalMarks;
    }

    // Write the logic to calculate the average marks using recursion
   public double calculateAverageScienceMarks (int[] science,int len)
    {
        double totalsciencemarks;
        if(len==1){
            return totalsciencemarks=science[0];
        }
        else {
            totalsciencemarks=science[len-1]+(len-1)*calculateAverageScienceMarks(science,len-1);
        }
        double averagesciencemarks=totalsciencemarks/len;
    return averagesciencemarks;
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageEnglishMarks (int[] english,int len)
    {
        double totalenglishmarks;
        if(len==1){
            return totalenglishmarks=english[0];
        }
        else {
            totalenglishmarks=english[len-1]+(len-1)*calculateAverageScienceMarks(english,len-1);
        }
        double averageenglishmarks=totalenglishmarks/len;
        return averageenglishmarks;
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageMathMarks (int[] math,int len)
    {
        double totalmathmarks;
        if(len==1){
            return totalmathmarks=math[0];
        }
        else {
            totalmathmarks=math[len-1]+(len-1)*calculateAverageScienceMarks(math,len-1);
        }
        double averagemathmarks=totalmathmarks/len;
        return averagemathmarks;
    }

    //Write the logic to find the top score in the class using recursion
    public int findTopScore(int [] totalMarks,int len){
        int totalmarks;
        if(len==1){
            return totalmarks=totalMarks[0];
        }
        totalmarks=totalMarks[len-1];
        if(totalMarks[0]>totalmarks){
            return totalmarks*findTopScore(totalMarks,len-1);
        }
        else{
            totalMarks[0]=totalmarks;
            return totalmarks=findTopScore(totalMarks,len-1);
        }

    }

    public static void main(String[] args) {
        OakBridgeSchool oakbridgeschool=new OakBridgeSchool();
        int[] math ={88,98,78,67,57,47,34,76,89,34};
        int[] science ={88,78,67,56,64,74,87,83,36,82};
        int[] english= {67,85,98,71,39,69,67,98,69,59};
        int noofsubjects=3;
        int testtakensubjectmarks=100;
        String[] Names = {"varsha", "bhavya", "harshitha", "romit", "harish", "pranay", "kavya", "sushmitha", "shiva", "shivansh"};
        int[] rollnum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int len= math.length;
        double averagesciencemarks= oakbridgeschool.calculateAverageScienceMarks(science,len);
        double averageenglishmarks= oakbridgeschool.calculateAverageEnglishMarks(english,len);
        double averagemathmarks= oakbridgeschool.calculateAverageMathMarks(science,len);
        int [] totalmarks= oakbridgeschool.calculateTotalMarks(math,science,english);
        int max = oakbridgeschool.findTopScore(totalmarks,len);
        System.out.println(max);
        System.out.println(averagesciencemarks);
        System.out.println(averageenglishmarks);
        System.out.println(averagemathmarks);
        // Initialize the OakBridgeSchool class object

        // Call the appropriate methods and display the output

    }
}
