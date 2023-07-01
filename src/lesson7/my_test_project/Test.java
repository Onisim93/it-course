package lesson7.my_test_project;

public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        game.init();

        Player player = new Player(game);
        player.jump();


    }
}
