 class ShortPath {

    public static float getShortestPath( String path){
        int x =0;
        int y =0;
        
        for(int i =0; i<path.length(); i++){
            //Direction
            char dir = path.charAt(i);

            //south
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            
            }
            //East

             else{
             x++;
            }
        }

        int X2 = x*x; // x square
        int Y2 = y*y; // y square

        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]){
        String path ="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}