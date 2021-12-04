
public class Scene {


    void sceneOne(){
        System.out.println("""
                You are on a dark bridge\s
                and before you there is a crossroads.\s
                There is thunder in the distances\s
                and you need to find shelter.\s
                To your left you can see an old building, that looks like a tavern.\s
                However, there are no light in the windows, that you can see\s
                To the left you can see some farm field in the\s
                distance.""");
        System.out.print("Press one to go left or two to go right ");
    }

    void sceneTwo(){
        System.out.println("""
                You approach the old tavern and hear a racked from within\s
                Press one to go in, press two to call out, or press three to continue on the path""");


    }

    void tavernOne(Player player){
        System.out.println("you enter the tavern and come face to face with a goblin who strikes you for one point of damage");
        player.setHealth(player.getHealth() - 1);
        Functions.checkHealth(player);
        System.out.println("Press one to run or two to fight: ");



    }

    void tavernTwo(){

    }

    void run(Player monster){
        System.out.println("You run out in to the rain\s" +
                "the " + monster.getName() + " does screams after you,\s" +
                "but does not follow you");
    }

    void longRoadOne(){
        System.out.println("The rain starts to beat down and the wind is picking up.\s" +
                "You do not see anything in the distance if you continue the way you were going.\s" +
                "If you want to continue on the path press one, if you want want to turn back press two.");
    }

    void tavernFight(Player player, Player monster){
        Functions.combat(player, monster);
        Functions.checkHealth(player);
        System.out.println("You have defeated the " + monster.getName() + " do you want to search the tavern for\s" +
                " additional threats");



    }

    void sceneThree(){
        System.out.println("""
                The lighting is getting worse and you have yet to see a building.\s
                There are some trees to the side of the road that might provide some shelter, or you could\s
                turn back and try your luck at the tavern. You could also continue down the path\s
                and see were it takes you.""");
        System.out.println(
                "Press one to continue on the path, press 2 to try the woods press 3 to go to the tavern."
        );

    }

    void roadOne(){

    }

    void roadTwo(){

    }
}
