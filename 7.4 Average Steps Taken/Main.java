import java.util.*;
import java.io.*;

public class Main
{
    /* =============================================
    ===== Challenge 7-10 - Average Steps Taken =====
    ================================================

    A Personal Fitness Tracker is a wearable device that tracks your physical activity, calories
    burned, heart rate, sleeping patterns, etc. One common physical activity that most of these
    devices track is the number of steps you take each day.

    Along with the starter code provided, there is a file named steps.txt. This file contains a
    number of steps a person has taken each day for a year. There are 365 lines in the file,
    and each line contains the number of steps taken during the day. (The first line is the
    number or steps taken on January 1, the second line is the number of steps taken on
    January 2, and so forth.) Write a program that reads the file, and then displays the
    average number of steps taken for each month.

    *Note: The data is not from a year that was not a leap year, so February has 28 days.*

     */public static void main(String[] args) throws IOException
    {
    // Named constants for the months
    int months;
    // Named constants for the days in the months
    int days;
    // Array of the month names
    int[] Months = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    // Array of the days of the months
    int[] Days = {31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

     
        // ArrayList to hold the steps
        int[] steps = {1102, 9236, 10643, 2376, 6815, 10394, 3055, 3750, 4181, 5452, 10745, 9896, 255, 9596, 1254, 2669, 1267, 1267, 1327, 10207, 5731, 8435, 640, 5624, 1062
    3946
           
            
            3796
            9381
            5945
            10612
            1970
            9035
            1376
            1919
            2868
            5847
            685
            10578
            3477
            3937
            5994
            6971
            3011
            4474
            4344
            8068
            6564
            2659
            4064
            1161
            6830
            5167
            5686
            5352
            898
            4316
            7699
            6406
            6466
            2802
            1239
            8162
            398
            9908
            8251
            8419
            6245
            8484
            9012
            6318
            853
            4031
            868
            8776
            10453
            1026
            1984
            8127
            5274
            6937
            1960
            9655
            1279
            9386
            6697
            6326
            2509
            7127
            7802
            8798
            6564
            7220
            10650
            3847
            7485
            10951
            3883
            9456
            4671
            2067
            6871
            1573
            8746
            7473
            4713
            1215
            8486
            6652
            4054
            10304
            5291
            2680
            9108
            6446
            1581
            7607
            2032
            7630
            1106
            3702
            986
            8602
            556
            2209
            3055
            886
            5813
            6513
            3154
            1534
            6271
            611
            4001
            6522
            3819
            8396
            2364
            9660
            5937
            2506
            9002
            8586
            8805
            552
            5802
            7825
            5610
            8169
            602
            5638
            2072
            3536
            5885
            9334
            6393
            9318
            6057
            5812
            5647
            4654
            1880
            634
            3084
            9606
            2287
            3032
            4030
            5627
            1314
            8489
            1601
            8559
            2083
            5520
            1829
            2890
            4533
            3225
            7405
            3985
            5521
            1127
            7109
            8083
            3615
            1475
            2896
            10523
            7108
            797
            8443
            169
            8755
            5761
            9862
            9032
            1659
            10944
            6878
            1253
            4690
            9934
            8820
            41
            9367
            1898
            3554
            10650
            3136
            3574
            9682
            3950
            691
            8247
            6677
            10381
            8879
            8660
            6431
            6030
            365
            10357
            10526
            9245
            5291
            4651
            5741
            800
            540
            6074
            68
            8714
            5095
            4578
            10841
            5805
            6676
            2547
            203
            10988
            604
            9057
            3787
            2397
            10984
            9807
            1703
            6382
            9793
            8592
            1279
            8005
            5297
            7166
            4070
            4252
            606
            6443
            10827
            8140
            5740
            10844
            8834
            3695
            4152
            10662
            8791
            7791
            9940
            831
            2999
            2254
            1161
            808
            4233
            3562
            3301
            1530
            7387
            6425
            9907
            9752
            4533
            7079
            3305
            5286
            4313
            1503
            6501
            8201
            1723
            9501
            9878
            1844
            5976
            6171
            10265
            2607
            10667
            2310
            836
            2618
            9813
            5907
            6849
            470
            8794
            528
            2327
            2200
            237
            618
            4898
            1307
            3212
            1007
            1322
            10409
            6956
            8653
            3462
            3207
            9210
            1309
            4431
            9106
            7737
            1698
            1117
            3826
            5297
            5589
            3199
            9089
            5967
            3156
            5919
            2855
            5985
            1780
            6267
            6303
            9855
            3843
            1816
            2876
            5973
            2888
            709
            6509
            4320
            10342
            2616
            4887
            10470
            6084
            4573
            2457
            10205
            4627
            7927
            1703
            5034, 7042, 4292}
        // Open the file
        File file = new File("steps.txt");
        Scanner inputFile = new Scanner(file);
        // Read the file's contents into the ArrayList
        while (inputFile.hasNext()){
            String friendName = inputFile.nextLine();
            System.out.println(friendName);
        }
        // Close the file
        inputFile.close();
        // Display the average steps for each month
        while ( Months[0] == Days[0]/31);
    // Returns the average number of steps for the given month

        // Calculate the starting position in the ArrayList

        // Go to the beginning of the specified month

        // Calculate the average of the steps

        // Return the average
    }
}
