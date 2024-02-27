public class TestingValsq {
    public static void main(String[] args) {
       int valueOfSquare[][] = {{120 ,-20 ,20 ,5 ,5 ,20 ,-20 ,120},
       {-20 ,-40 ,-5 ,-5 ,-5 ,-5 ,-40 ,-20},
       {20 ,-5 ,15 ,3, 3, 15 ,-5 ,20},
       {5 ,-5 ,3 ,3 ,3 ,3 ,-5 ,5},
       {5 ,-5 ,3 ,3 ,3,3 ,-5 ,5},
       {20 ,-5 ,15 ,3 ,3 ,15, -5 ,20},
       {-20 ,-40 ,-5 ,-5 ,-5 ,-5 ,-40 ,-20},
       {120 ,-20 ,20 ,5 ,5 ,20 ,-20, 120}};
       for (int i = 0; i < 8; i++) {
           for(int j = 0;j < 8; j++){
               System.out.print(valueOfSquare[i][j]+"\t");
           }
           System.out.println();
       }
    }
   }
   