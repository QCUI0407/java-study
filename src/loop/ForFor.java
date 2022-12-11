package loop;
public class ForFor {
    public static void main(String[] args) {
        /**
         *打印出下列星号
          *****
          *****
          *****
          *****
         */
        for(int i = 0;i<4;i++){
            for (int j = 0; j<5; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
