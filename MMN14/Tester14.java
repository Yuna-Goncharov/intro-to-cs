public class Tester14{
	
	public static void main(String[] args) {
		System.out.println("******Q1:*******");
        int[][] mat0 = {
                {0,1,0,0,0,1},
                {1,0,0,1,1,1},
                {0,0,0,0,0,1},
                {1,1,1,1,1,1},
                {0,1,0,1,0,1},
                {1,0,0,0,1,0}};
        int[][] mat1 = { //sink=1
                {0, 1},
                {0, 0}};
       
        int[][] mat2 = {
                {0, 1, 1},
                {0, 1, 1},
                {0, 0, 0}};
        int[][] mat3 = {
                {0,1,0,1,1,0},
                {1,0,1,1,0,0},
                {0,0,0,1,0,1},
                {0,0,0,0,0,0},
                {1,0,1,1,0,0},
                {0,1,0,1,1,1}};
        int[][] mat4 = {
                {0,1,0,1,1,0},
                {1,0,1,1,0,0},
                {0,0,0,1,0,1},
                {0,0,0,0,0,1},
                {1,0,1,1,0,0},
                {0,1,0,1,1,1}};
        int[][] mat5 = {
                {0,1,0,1,1,0},
                {1,0,1,1,0,0},
                {0,0,0,1,0,1},
                {1,0,0,0,0,0},
                {1,0,1,1,0,0},
                {0,1,0,1,1,1}};
        int[][] mat6 = {
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1}};
        int[][] mat7 = {
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,0}};
        int[][] mat8 = {
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,1,0},
                {0,0,0,0,0,0}};
        int[][] mat9 = {
                {0,0,1,0,0,0},
                {0,0,0,1,0,0},
                {0,0,1,0,0,0},
                {0,0,0,1,0,0},
                {0,0,1,0,0,0},
                {0,0,0,0,0,0}};
        int[][] mat10 = {
                {0,0,1,1,0,0},
                {0,0,1,1,0,0},
                {0,0,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,0,0},
                {0,0,0,1,0,0}};
        int[][] mat11 = {
                {0,0,1,1,0,0},
                {0,0,1,1,0,0},
                {0,0,1,1,0,0},
                {1,0,0,0,0,0},
                {0,0,1,1,0,0},
                {0,0,0,1,0,0}};
        int[][] mat12 = {
                {0,0,1,1,0,1},
                {0,0,1,1,0,1},
                {0,0,1,1,0,1},
                {1,0,0,0,1,1},
                {0,0,1,1,0,1},
                {0,0,0,0,0,0}};  
        int[][] mat13 = {
                {1,0,1,1,0,1},
                {0,0,0,1,0,1},
                {0,0,1,1,0,1},
                {1,0,0,0,0,0},
                {0,0,1,1,0,1},
                {0,0,0,0,0,0}};
        int[][] mat14 = {
                {0,0,1,1,1,1},
                {0,0,1,1,1,1},
                {0,0,1,1,1,1},
                {1,0,0,0,1,1},
                {0,0,0,0,0,0},
                {0,0,0,0,1,0}};  
        int[][] mat15 = {
                {1,1,1,1,1,1},
                {0,0,1,1,1,1},
                {0,0,1,1,1,1},
                {1,0,0,1,1,0},
                {0,0,0,0,0,0},
                {0,0,0,0,1,0}};        
               
        if( Ex14.isSink(mat0) != -1 ||
        Ex14.isSink(mat1) != 1 || Ex14.isSink(mat2) != 2  || Ex14.isSink(mat3) != 3 || Ex14.isSink(mat4) != -1 || Ex14.isSink(mat5) != -1
        || Ex14.isSink(mat6) != -1 || Ex14.isSink(mat7) != 5
        || Ex14.isSink(mat8) != -1 || Ex14.isSink(mat9) != -1
        || Ex14.isSink(mat10) != 3|| Ex14.isSink(mat11) != -1 || Ex14.isSink(mat12) != 5|| Ex14.isSink(mat13) != -1|| Ex14.isSink(mat14) != 4|| Ex14.isSink(mat14) != 4)
            System.out.println("isSink() is failed");
        else
            System.out.println("isSink() is Success");
 
        System.out.println("");
        System.out.println("Mat Results:");
        System.out.println("");
        System.out.println("Mat 0: " + Ex14.isSink(mat0)+ " while it should be -1");
        System.out.println("Mat 1: " + Ex14.isSink(mat1)+ " while it should be 1");
        System.out.println("Mat 2: " + Ex14.isSink(mat2)+ " while it should be 2");
        System.out.println("Mat 3: " + Ex14.isSink(mat3)+ " while it should be 3");
        System.out.println("Mat 4: " + Ex14.isSink(mat4)+ " while it should be -1");
        System.out.println("Mat 5: " + Ex14.isSink(mat5)+ " while it should be -1");
        System.out.println("Mat 6: " + Ex14.isSink(mat6)+ " while it should be -1");
        System.out.println("Mat 7: " + Ex14.isSink(mat7)+ " while it should be 5");
        System.out.println("Mat 8: " + Ex14.isSink(mat8)+ " while it should be -1");
        System.out.println("Mat 9: " + Ex14.isSink(mat9)+ " while it should be -1");
        System.out.println("Mat 10: " + Ex14.isSink(mat10)+ " while it should be 3");
        System.out.println("Mat 11: " + Ex14.isSink(mat11)+ " while it should be -1");
        System.out.println("Mat 12: " + Ex14.isSink(mat12)+ " while it should be 5");
        System.out.println("Mat 13: " + Ex14.isSink(mat13)+ " while it should be -1");
        System.out.println("Mat 14: " + Ex14.isSink(mat14)+ " while it should be 4");
        System.out.println("Mat 15: " + Ex14.isSink(mat15)+ " while it should be 4");
       
        System.out.println("\n\n******Q2:*******\n");
        checkFind();
        System.out.println("\n\n******Q3:*******\n");

        checkIsSumOf();

    }
	private static void checkFind() {
        int[][] mat20 = {
                {1, 2},
                {3, 4}};
        int[][] mat21 = {
                {-4,-2,5,9,},
                {2,5,12,13,},
                {13,20,25,27,},
                {22,24,49,57,}};
        int[][] mat22 = {
                {1,2,5,6,17,18,22,23},
                {3,4,7,8,19,20,23,24},
                {9,10,13,14,25,26,31,33},
                {11,12,15,16,27,30,34,37},
                {40,43,47,50,71,72,76,77},
                {45,47,50,51,73,74,79,80},
                {61,62,66,68,81,84,90,90},
                {64,65,70,71,85,89,93,100}
                };
        int[][] mat23 = {
                {1,2,5,6,17,18,22,23},
                {3,4,7,8,19,20,23,24},
                {9,10,13,14,25,26,31,33},
                {11,12,15,16,27,30,34,37},
                {40,43,47,50,71,72,76,77},
                {45,47,50,51,73,74,79,80},
                {61,62,66,68,81,84,90,90},
                {64,65,70,71,85,89,93,100}
                };
        int[][] mat24 = {
        		{0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341},
        		{2, 3, 6, 7, 18, 19, 22, 23, 66, 67, 70, 71, 82, 83, 86, 87, 258, 259, 262, 263, 274, 275, 278, 279, 322, 323, 326, 327, 338, 339, 342, 343},
        		{8, 9, 12, 13, 24, 25, 28, 29, 72, 73, 76, 77, 88, 89, 92, 93, 264, 265, 268, 269, 280, 281, 284, 285, 328, 329, 332, 333, 344, 345, 348, 349},
        		{10, 11, 14, 15, 26, 27, 30, 31, 74, 75, 78, 79, 90, 91, 94, 95, 266, 267, 270, 271, 282, 283, 286, 287, 330, 331, 334, 335, 346, 347, 350, 351},
        		{32, 33, 36, 37, 48, 49, 52, 53, 96, 97, 100, 101, 112, 113, 116, 117, 288, 289, 292, 293, 304, 305, 308, 309, 352, 353, 356, 357, 368, 369, 372, 373},
        		{34, 35, 38, 39, 50, 51, 54, 55, 98, 99, 102, 103, 114, 115, 118, 119, 290, 291, 294, 295, 306, 307, 310, 311, 354, 355, 358, 359, 370, 371, 374, 375},
        		{40, 41, 44, 45, 56, 57, 60, 61, 104, 105, 108, 109, 120, 121, 124, 125, 296, 297, 300, 301, 312, 313, 316, 317, 360, 361, 364, 365, 376, 377, 380, 381},
        		{42, 43, 46, 47, 58, 59, 62, 63, 106, 107, 110, 111, 122, 123, 126, 127, 298, 299, 302, 303, 314, 315, 318, 319, 362, 363, 366, 367, 378, 379, 382, 383},
        		{128, 129, 132, 133, 144, 145, 148, 149, 192, 193, 196, 197, 208, 209, 212, 213, 384, 385, 388, 389, 400, 401, 404, 405, 448, 449, 452, 453, 464, 465, 468, 469},
        		{130, 131, 134, 135, 146, 147, 150, 151, 194, 195, 198, 199, 210, 211, 214, 215, 386, 387, 390, 391, 402, 403, 406, 407, 450, 451, 454, 455, 466, 467, 470, 471},
        		{136, 137, 140, 141, 152, 153, 156, 157, 200, 201, 204, 205, 216, 217, 220, 221, 392, 393, 396, 397, 408, 409, 412, 413, 456, 457, 460, 461, 472, 473, 476, 477},
        		{138, 139, 142, 143, 154, 155, 158, 159, 202, 203, 206, 207, 218, 219, 222, 223, 394, 395, 398, 399, 410, 411, 414, 415, 458, 459, 462, 463, 474, 475, 478, 479},
        		{160, 161, 164, 165, 176, 177, 180, 181, 224, 225, 228, 229, 240, 241, 244, 245, 416, 417, 420, 421, 432, 433, 436, 437, 480, 481, 484, 485, 496, 497, 500, 501},
        		{162, 163, 166, 167, 178, 179, 182, 183, 226, 227, 230, 231, 242, 243, 246, 247, 418, 419, 422, 423, 434, 435, 438, 439, 482, 483, 486, 487, 498, 499, 502, 503},
        		{168, 169, 172, 173, 184, 185, 188, 189, 232, 233, 236, 237, 248, 249, 252, 253, 424, 425, 428, 429, 440, 441, 444, 445, 488, 489, 492, 493, 504, 505, 508, 509},
        		{170, 171, 174, 175, 186, 187, 190, 191, 234, 235, 238, 239, 250, 251, 254, 255, 426, 427, 430, 431, 442, 443, 446, 447, 490, 491, 494, 495, 506, 507, 510, 511},
        		{512, 513, 516, 517, 528, 529, 532, 533, 576, 577, 580, 581, 592, 593, 596, 597, 768, 769, 772, 773, 784, 785, 788, 789, 832, 833, 836, 837, 848, 849, 852, 853},
        		{514, 515, 518, 519, 530, 531, 534, 535, 578, 579, 582, 583, 594, 595, 598, 599, 770, 771, 774, 775, 786, 787, 790, 791, 834, 835, 838, 839, 850, 851, 854, 855},
        		{520, 521, 524, 525, 536, 537, 540, 541, 584, 585, 588, 589, 600, 601, 604, 605, 776, 777, 780, 781, 792, 793, 796, 797, 840, 841, 844, 845, 856, 857, 860, 861},
        		{522, 523, 526, 527, 538, 539, 542, 543, 586, 587, 590, 591, 602, 603, 606, 607, 778, 779, 782, 783, 794, 795, 798, 799, 842, 843, 846, 847, 858, 859, 862, 863},
        		{544, 545, 548, 549, 560, 561, 564, 565, 608, 609, 612, 613, 624, 625, 628, 629, 800, 801, 804, 805, 816, 817, 820, 821, 864, 865, 868, 869, 880, 881, 884, 885},
        		{546, 547, 550, 551, 562, 563, 566, 567, 610, 611, 614, 615, 626, 627, 630, 631, 802, 803, 806, 807, 818, 819, 822, 823, 866, 867, 870, 871, 882, 883, 886, 887},
        		{552, 553, 556, 557, 568, 569, 572, 573, 616, 617, 620, 621, 632, 633, 636, 637, 808, 809, 812, 813, 824, 825, 828, 829, 872, 873, 876, 877, 888, 889, 892, 893},
        		{554, 555, 558, 559, 570, 571, 574, 575, 618, 619, 622, 623, 634, 635, 638, 639, 810, 811, 814, 815, 826, 827, 830, 831, 874, 875, 878, 879, 890, 891, 894, 895},
        		{640, 641, 644, 645, 656, 657, 660, 661, 704, 705, 708, 709, 720, 721, 724, 725, 896, 897, 900, 901, 912, 913, 916, 917, 960, 961, 964, 965, 976, 977, 980, 981},
        		{642, 643, 646, 647, 658, 659, 662, 663, 706, 707, 710, 711, 722, 723, 726, 727, 898, 899, 902, 903, 914, 915, 918, 919, 962, 963, 966, 967, 978, 979, 982, 983},
        		{648, 649, 652, 653, 664, 665, 668, 669, 712, 713, 716, 717, 728, 729, 732, 733, 904, 905, 908, 909, 920, 921, 924, 925, 968, 969, 972, 973, 984, 985, 988, 989},
        		{650, 651, 654, 655, 666, 667, 670, 671, 714, 715, 718, 719, 730, 731, 734, 735, 906, 907, 910, 911, 922, 923, 926, 927, 970, 971, 974, 975, 986, 987, 990, 991},
        		{672, 673, 676, 677, 688, 689, 692, 693, 736, 737, 740, 741, 752, 753, 756, 757, 928, 929, 932, 933, 944, 945, 948, 949, 992, 993, 996, 997, 1008, 1009, 1012, 1013},
        		{674, 675, 678, 679, 690, 691, 694, 695, 738, 739, 742, 743, 754, 755, 758, 759, 930, 931, 934, 935, 946, 947, 950, 951, 994, 995, 998, 999, 1010, 1011, 1014, 1015},
        		{680, 681, 684, 685, 696, 697, 700, 701, 744, 745, 748, 749, 760, 761, 764, 765, 936, 937, 940, 941, 952, 953, 956, 957, 1000, 1001, 1004, 1005, 1016, 1017, 1020, 1021},
        		{682, 683, 686, 687, 698, 699, 702, 703, 746, 747, 750, 751, 762, 763, 766, 767, 938, 939, 942, 943, 954, 955, 958, 959, 1002, 1003, 1006, 1007, 1018, 1019, 1022, 1023}
        		};


        if(!Ex14.find(mat21, 25))
            System.out.println("checkFind() number 1,\t mat 21, x = 25\tfailed\t returned " + Ex14.find(mat21, 25) + "\t Should be: true");
        else 
            System.out.println("checkFind() number 1,\t mat 21, x = 25\tSuccess\t returned " + Ex14.find(mat21, 25) + "\tShould be: true");
        if(Ex14.find(mat21, 16))
            System.out.println("checkFind() number 2,\t mat 21, x = 25\tfailed\t returned " + Ex14.find(mat21, 25) + "\tShould be: false");
        else 
            System.out.println("checkFind() number 2,\t mat 21, x = 16\tSuccess\t returned " + Ex14.find(mat21, 16) + "\tShould be: false");
        if(Ex14.find(mat21, 43))
            System.out.println("checkFind() number 3,\t mat 21, x = 43\tfailed\t returned " + Ex14.find(mat21, 43) + "\tShould be: false");
        else 
            System.out.println("checkFind() number 3,\t mat 21, x = 43\tSuccess\t returned " + Ex14.find(mat21, 43) + "\tShould be: false");
        if(!Ex14.find(mat22, 25))
            System.out.println("checkFind() number 4,\t mat 22, x = 25\tfailed\t returned " + Ex14.find(mat22, 25) + "\tShould be: true");
        else 
            System.out.println("checkFind() number 4,\t mat 22, x = 25\tSuccess\t returned " + Ex14.find(mat22, 25) + "\tShould be: true");
        if(!Ex14.find(mat22, 4))
            System.out.println("checkFind() number 5,\t mat 22, x = 4\tfailed\t returned " + Ex14.find(mat22, 4) + "\tShould be: true");
        else 
            System.out.println("checkFind() number 5,\t mat 22, x = 4\tSuccess\t returned " + Ex14.find(mat22, 4) + "\tShould be: true");
        if(!Ex14.find(mat23, 70))
            System.out.println("checkFind() number 6,\t mat 23, x = 70\tfailed\t returned " + Ex14.find(mat23, 70) + "\tShould be: true");
        else 
            System.out.println("checkFind() number 6,\t mat 23, x = 70\tSuccess\t returned " + Ex14.find(mat23, 70) + "\tShould be: true");
        if(!Ex14.find(mat23, 37))
            System.out.println("checkFind() number 7,\t mat 23, x = 37\tfailed\t returned " + Ex14.find(mat23, 37) + "\tShould be: true");
        else 
            System.out.println("checkFind() number 7,\t mat 23, x = 37\tSuccess\t returned " + Ex14.find(mat23, 37) + "\tShould be: true");
        if(!Ex14.find(mat23, 40))
            System.out.println("checkFind() number 8,\t mat 23, x = 40\tfailed\t returned " + Ex14.find(mat23, 40) + "\tShould be: true");
        else 
            System.out.println("checkFind() number 8,\t mat 23, x = 40\tSuccess\t returned " + Ex14.find(mat23, 40) + "\tShould be: true");
        if(Ex14.find(mat20, -2))
            System.out.println("checkFind() number 9,\t mat 20, x = -2\tfailed\t returned " + Ex14.find(mat20, -2) + "\tShould be: false");
        else 
            System.out.println("checkFind() number 9,\t mat 20, x = -2\tSuccess\t returned " + Ex14.find(mat20, -2) + "\tShould be: false");
        if(!Ex14.find(mat20, 3))
            System.out.println("checkFind() number 10,\t mat 20, x = 3\tfailed\t returned " + Ex14.find(mat20, 3) + "\tShould be: true");
        else 
            System.out.println("checkFind() number 10,\t mat 20, x = 3\tSuccess\t returned " + Ex14.find(mat20, 3) + "\tShould be: true");
        if(!Ex14.find(mat21, -2))
            System.out.println("checkFind() number 11,\t mat 21, x = -2\tfailed\t returned " + Ex14.find(mat21, -2) + "\tShould be: true");
        else 
            System.out.println("checkFind() number 11,\t mat 21, x = -2\tSuccess\t returned " + Ex14.find(mat21, -2) + "\tShould be: true");
        if(!Ex14.find(mat24, 133))
            System.out.println("checkFind() number 12,\t mat 24, x = 133 failed\t returned " + Ex14.find(mat24, 133) + "\tShould be: true");
        else 
            System.out.println("checkFind() number 12,\t mat 24, x = 133 Success returned " + Ex14.find(mat24, 133) + "\tShould be: true");
        if(!Ex14.find(mat24, 56))
            System.out.println("checkFind() number 13,\t mat 24, x = 56\tfailed\t returned " + Ex14.find(mat24, 56) + "\tShould be: true");
        else 
            System.out.println("checkFind() number 13,\t mat 24, x = 56\tSuccess\t returned " + Ex14.find(mat24, 56) + "\tShould be: true");
        if(Ex14.find(mat23, 63))
            System.out.println("checkFind() number 14,\t mat 23, x = 63\tfailed\t returned " + Ex14.find(mat23, 63) + "\tShould be: false");
        else 
            System.out.println("checkFind() number 14,\t mat 23, x = 63\tSuccess\t returned " + Ex14.find(mat23, 63) + "\tShould be: false");
        if(Ex14.find(mat24, 1024))
            System.out.println("checkFind() number 15,\t mat 24, x = 1024\tfailed\t returned " + Ex14.find(mat24, 1024) + "\tShould be: false");
        else 
            System.out.println("checkFind() number 15,\t mat 24, x =1024 Success returned " + Ex14.find(mat24, 1024) + " Should be: false");
        if(Ex14.find(mat23, 56))
            System.out.println("checkFind() number 15,\t mat 23, x = 56\tfailed\t returned " + Ex14.find(mat23, 56) + "\tShould be: false");
        else 
            System.out.println("checkFind() number 15,\t mat 23, x =56\tSuccess\t returned " + Ex14.find(mat23, 56) + "\tShould be: false");
       
    }
	private static void findTest(int[][] mat) {
		int x;
		int fails = 0;
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat.length; j++) {
				x = mat[i][j];
				if (!Ex14.find(mat, x)) {
					System.out.println("\nFind failed on mat[" + i + "]" + "[" + j + "] x=" + x);
					System.out.println("******************************************************************");
					System.out.println("");
					fails++;
				}
			}
		if(fails==0)
		System.out.println("\n********\nmethod Find is good :)");
		else
			System.out.println("\n\n*****method Find failed "+fails+" times******\n\t*************\n");
	}
	private static String toString(int[] arr) 
	{
		String result = "{";
		for(int i = 0; i < arr.length - 1; i++)
		{
			result += arr[i] + ", ";
		}
		result += arr[arr.length - 1] + "}";
		return result;
	}

	private static void testQuestion3(int[] arr, int num, boolean expectedResult)
	{
		if(Ex14.isSumOf(arr, num) == expectedResult)
		{
			System.out.println("OK - arr: " + toString(arr) + "\tNum: " + num);
		}
		else
		{
			System.out.println("ERROR - Expected " + expectedResult + ", actual: " + Ex14.isSumOf(arr, num) + "\tArr: " + toString(arr) + "\tNum: " + num);
		}
	}
	
	public static void checkIsSumOf()
	{
		int[] arr1 = {10, 19};
		int num1 = 39;
		boolean expectedResult1 = true;
		
		int[] arr2 = {1};
		int num2 = 243;
		boolean expectedResult2 = true;
		
		int[] arr3 = {15, 20, 3};
		int num3 = 17;
		boolean expectedResult3 = false;
		
		int[] arr4 = {5, 10, 20, 40};
		int num4 = 20;
		boolean expectedResult4 = true;
		
		int[] arr5 = {16, 17, 18, 19};
		int num5 = 20;
		boolean expectedResult5 = false;
		
		int[] arr6 = {4, 9, 3};
		int num6 = 5;
		boolean expectedResult6 = false;
		
		
		
		testQuestion3(arr1, num1, expectedResult1);
		testQuestion3(arr2, num2, expectedResult2);
		testQuestion3(arr3, num3, expectedResult3);
		testQuestion3(arr4, num4, expectedResult4);
		testQuestion3(arr5, num5, expectedResult5);
		testQuestion3(arr6, num6, expectedResult6);
		
	}
}