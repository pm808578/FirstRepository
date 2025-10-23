package ArrayPrograms;

public class SecondLargestInArray {
    static void main(String[] args) {
        int [] arr={10, 39, 45,98, 78, 14, 67};

        int largest=0;
        int secondLarge=0;
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]>largest)
                largest=arr[i];
            else if (arr[i]>secondLarge && secondLarge < largest )
            {
                secondLarge=arr[i];
            }
        }

        System.out.println("largest no in array is "+largest);

        System.out.println("second largest no in array is "+secondLarge);
    }
}
