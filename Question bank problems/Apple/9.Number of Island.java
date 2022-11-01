class Solution{
    public void dfs(char[][] grid,int r,int c){
        int row=grid.length;
        int col=grid[0].length;
        if(r<0 || c<0||r>=row|| c>=col || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        dfs(grid,r-1,c);//top
        dfs(grid,r+1,c);//down
        dfs(grid,r,c-1);//left
        dfs(grid,r,c+1);//right
    }
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int islandCount=0;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(grid[r][c]=='1'){
                    ++islandCount;
                    dfs(grid,r,c);
                }
                
            }
        }
        return islandCount;
        
    }
}
