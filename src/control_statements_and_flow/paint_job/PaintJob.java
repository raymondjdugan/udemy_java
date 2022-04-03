package control_statements_and_flow.paint_job;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        int numOfBuckets = 0;
        return numOfBuckets = (int) Math.ceil((area / areaPerBucket) - extraBuckets) ;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        int numOfBuckets = 0;
        return numOfBuckets = (int) Math.ceil(area / areaPerBucket) ;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (areaPerBucket <= 0 || area <= 0) {
            return -1;
        }
        int numOfBuckets = 0;
        return numOfBuckets = (int) Math.ceil(area / areaPerBucket) ;
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }
}
