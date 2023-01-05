package ObjectOrientedProgramming;

public class AccessModifiers {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.name = "ROHIT SHARMA";
        ac.email = "rohitsharma45@gmail.com";
        ac.setHighestScore(264);
        System.out.println(ac.getHighestScore());
    }
}

class Account {
    public String name;
    protected String email;

    public int getHighestScore() {
        return this.highestScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    private int highestScore;
}
