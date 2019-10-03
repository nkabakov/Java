package course2.HW.lesson1.Marathon.competitors;


public class Team {
    String name;
    Competitor[] competitors;

    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showWinners (){
        for (Competitor c:competitors) {
            if(c.isOnDistance()){
                c.info();
            }
        }

    }
}
