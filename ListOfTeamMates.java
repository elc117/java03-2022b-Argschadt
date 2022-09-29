import java.util.ArrayList;

public class ListOfTeamMates{
	public static void main(String[] args) {
		ArrayList<TeamMate> list = new ArrayList<TeamMate>();
		
		TeamMate a = new TeamMate("1", "Name 1", false);
		list.add(a);
		
		for (int i = 0; i < 20; i++) {
	      list.add(new TeamMate("" + (i+2), "Name " + (i+2), false));
	    }
		
		for (int i = 0; i < 20; i++) {
	      list.add(new TeamMate("" + (i+22), "Name " + (i+22), true));
	    }
		
		System.out.println("---");
	    for (int i = 0; i < list.size(); i++) {
	      System.out.println(list.get(i).getName());
	    }
	    
	    for (TeamMate item : list) {
	    	if(item.getOnline() == true) {
	    		System.out.println(item.getUserId());
	    	}
	    }
	    
	    list.remove(0);
	    
	    System.out.println("Elemento 0 removido");
	    for (int i = 0; i < list.size(); i++) {
	      System.out.println(list.get(i).getName());
	    }
	}
}