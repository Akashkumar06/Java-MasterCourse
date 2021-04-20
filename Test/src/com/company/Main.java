public class Main
{
    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;

        //Initialize matrix a  
        int a[][] = {
                {0, 0, 5},
                {7,0,0},
                {0, 6, 0},
                {0, 0, 0}
        };

        //Calculates number of rows and columns present in given matrix
        rows = a.length;
        cols = a[0].length;


        //Calculates sum of each row of given matrix  
        for(int i = 0; i < rows; i++){
            sumRow = 0;
            for(int j = 0; j < cols; j++){
                sumRow = sumRow + a[i][j];
            }

            for(int p = 0; p < cols; p++){
                sumCol = 0;
                for(int q= 0; q < rows; q++){
                    sumCol = sumCol + a[p][q];
                }

                if(sumRow<=sumCol){
                    for (int k = 0; k < rows; k++)
                        for (int l = 0; l < cols; l++)
                            if (a[k][l] == 0){
                                if((1+sumRow)%2==0){
                                    a[k][l] = 1;
                                }
                                else{
                                    a[k][l] = 2;
                                }

                            }

                }else{
                    for (int k = 0; k < rows; k++)
                        for (int l = 0; l < cols; l++)
                            if (a[k][l] == 0){
                                if((1+sumRow)%3==0){
                                    a[k][l] = 1;
                                }
                                else{
                                    a[k][l] =sumRow%3;
                                }

                            }


                }

            }
        }

        //Calculates sum of each column of given matrix  

    }
}

