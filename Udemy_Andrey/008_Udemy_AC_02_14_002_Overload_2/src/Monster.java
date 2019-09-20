public class Monster {

    private static final int default_n = 2;

    private int n_legs;
    private int n_arms;
    private int n_eyes;

    public Monster() {
        n_legs = n_arms = n_eyes = default_n;
    }

    public Monster (int n_legs, int n_arms, int n_eyes) {
        this.n_legs = n_legs;
        this.n_arms = n_arms;
        this.n_eyes = n_eyes;
    }

    public Monster (int n_legs, int n_arms) {
        this.n_legs = n_legs;
        this.n_arms = n_arms;
        this.n_eyes = default_n;
    }

    public Monster (int n_legs) {
        this.n_legs = n_legs;
        this.n_arms = default_n;
        this.n_eyes = default_n;
    }

    public void voice() {
        System.out.println("Voice");
    }

    public void voice(int num_voice) {
        for (int i = 0; i < num_voice; ++i) {
            System.out.print("Voice!   ");
        }
        System.out.println();
    }

    public void voice(int num_voice, String word) {
        for (int i = 0; i < num_voice; ++i) {
            System.out.print(word + "   ");
        }
        System.out.println();
    }


}
