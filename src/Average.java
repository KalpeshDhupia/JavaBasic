public class Average {
    public static void main(String[] args) {
        int marks[] = {10,20,30,40,80};
        Average average = new Average();
            float a = average.avg(marks,marks.length);
        System.out.println(a);
    }

    private float avg(int[] marks, int length) {
        int sum = 0, avg = 0;
for (int i =0; i<marks.length;i++){
    sum += marks[i];}
avg = sum /marks.length;
        return avg;
    }
}
