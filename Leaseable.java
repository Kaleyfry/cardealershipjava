package cardealership;

interface Leaseable {
    boolean isLeaseable();

    int getLeaseTerm();

    int getMaxMilesPerYear();

    default float getMileablePenalty() {
        return 500.0f;
    }
}