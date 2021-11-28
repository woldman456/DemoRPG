public class Scene {
    void sceneOne(){
        System.out.println("""
                You are on a dark bridge\s
                and before you stands is a crossroads.\s
                There is thunder in the distances\s
                and you need to find shelter.\s
                To your left you can see an old build,that looks like a tavern.\s
                However, there are no light in with in the windows that you can see\s
                To the left you can see some farm field in the\s
                distance.""");
        System.out.print("Press one to go left or two to go right ");
    }

    void sceneTwo(){
        System.out.println("""
                You approach the old tavern and hear a racked from within\s
                Do you go in, call out, or continue on the path""");
        System.out.println("If you want to continue on the path press one, if you wish to go in press two\s" +
                "if you want to call out press three");


    }

    void tavernOne(Player player){
        System.out.println("you enter the tavern and a Troll strikes you for 10 damage");
        player.setHealth(player.getHealth() - 10);
        Functions.checkHealth(player);


    }

    void tavernTwo(){

    }

    void tavernThree(){

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
