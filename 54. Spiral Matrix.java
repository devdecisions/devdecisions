class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
               
                List<Integer> list = new ArrayList<>();


                if (matrix == null || matrix.length == 0) {
                 return list;
        }

        int rows = matrix.length, cols = matrix[0].length;
        int top=0;
        int down = rows-1;
        int left=0;
        int right =cols-1;
        int dir=0;
        while(left<=right && top<=down)
        {

            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    list.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    list.add(matrix[i][right]);
                }
                right--;
            }
           else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[down][i]);
                }
                down--;
            }
           else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }

            dir=(dir+1)%4;
        }

         return list;
        
    }
}
