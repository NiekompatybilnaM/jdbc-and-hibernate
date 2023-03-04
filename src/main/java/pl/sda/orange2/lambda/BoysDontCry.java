package pl.sda.orange2.lambda;

public interface BoysDontCry {
    void silnoreki();

    BoysDontCry anonymousClassReference = new BoysDontCry() {
        @Override
        public void silnoreki() {
            System.out.println("Anonimowy silnoreki:)");
        }
    };
}