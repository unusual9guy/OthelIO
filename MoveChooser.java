import java.util.ArrayList; 
public class MoveChooser {
    public static int valueOfSquare[][] = {{120 ,-20 ,20 ,5 ,5 ,20 ,-20 ,120},
                                {-20 ,-40 ,-5 ,-5 ,-5 ,-5 ,-40 ,-20},
                                {20 ,-5 ,15 ,3, 3, 15 ,-5 ,20},
                                {5 ,-5 ,3 ,3 ,3 ,3 ,-5 ,5},
                                {5 ,-5 ,3 ,3 ,3,3 ,-5 ,5},
                                {20 ,-5 ,15 ,3 ,3 ,15, -5 ,20},
                                {-20 ,-40 ,-5 ,-5 ,-5 ,-5 ,-40 ,-20},
                                {120 ,-20 ,20 ,5 ,5 ,20 ,-20, 120}};
  
    public static Move chooseMove(BoardState boardState){
    	
    	
	int searchDepth = Othello.searchDepth;
        ArrayList<Move> moves= boardState.getLegalMoves();
        int result = 0;
        int retval = 0;
        if(moves.isEmpty()){
            return null;
            }
        else {
        	result = miniMaxAB(searchDepth,-1000,1000,boardState);   
        	for(int i = 0; i < moves.size();i++) {	            
                	int xval = moves.get(i).x;
                    int yval = moves.get(i).y;
                    if(result >= valueOfSquare[xval][yval])break;
           
        	}
        	for(int i =0; i< moves.size();i++) {
        		if(valueOfSquare[moves.get(i).x][moves.get(i).y] == result){
                    retval =i;
                    break;
                } 
        	}
        	return moves.get(retval);	 
        }    
    
    }
    
    
    public static int miniMaxAB(int depth, int alpha, int beta,BoardState boardstate) {
    	
    	ArrayList<Move> moves= boardstate.getLegalMoves();
    	int flag=0;
        if(moves.isEmpty() && boardstate.gameOver() == false)
        	{
        	boardstate.colour = 1;
        	return miniMaxAB(depth, alpha, beta, boardstate);
        	}
        	
    	if(depth == 0) return staticEval(boardstate);
        else if(boardstate.colour == 1){
            alpha = -1000;            
            for(int i = 0;i < moves.size(); i++){
            	BoardState boardstate_new = boardstate.deepCopy();
                boardstate_new.makeLegalMove(moves.get(i).x, moves.get(i).x);
                int res = miniMaxAB(depth-1, alpha, beta, boardstate);
                alpha = Math.max(alpha,res);
                if(beta <= alpha) {
                    break;
                }  
            }
            flag = alpha;
        }

        else if(boardstate.colour == -1){
            beta = 1000;
            for(int i = 0;i < moves.size(); i++){
            	BoardState boardstate_new = boardstate.deepCopy();
                boardstate_new.makeLegalMove(moves.get(i).x, moves.get(i).x);
	            int res = miniMaxAB(depth-1, alpha, beta, boardstate);
	            beta = Math.min(beta,res);
	            if(beta <= alpha){
	                break; 
	            } 
            }   
            flag= beta;
    }
    	return flag;
		
}
   
    /*
     0   1  2  3  4  5   6   7
0  120 -20 20  5  5 20 -20 120
1  -20 -40 -5 -5 -5 -5 -40 -20
2   20 -5  15  3  3 15  -5  20
3    5 -5   3  3  3  3  -5   5
4	5 -5   3  3  3  3  -5   5
5   20 -5  15  3  3 15  -5  20
6  -20 -40 -5 -5 -5 -5 -40 -20
7  120 -20 20  5  5 20 -20 120
    */
   // returns the possible value based on the square 
    // update the function so that it checks the neighbouring squares and returns the best value among them 
   public static int staticEval(BoardState boardstate) {   		
	   int val_white = 0, val_black = 0, val_board;
	   int colour_of_piece;
	   for(int i = 0; i < 8; i++) {
		   for(int j = 0; j < 8; j++) {
			   colour_of_piece = boardstate.getContents(i, j);
			   if(colour_of_piece == 1) val_white += valueOfSquare[i][j];
               if(colour_of_piece == -1) val_black += valueOfSquare[i][j];
		   }
	   }
       val_board = val_white - val_black;
       return val_board;
	   
	   

       
       

    }
   		
   
}
