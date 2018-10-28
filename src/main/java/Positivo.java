public class Positivo {
    private int n;
    public Positivo()
    {
        n=10;
    }
    public int sumar(Negativo ne)
    {
        return this.n+ne.getN();
    }
}
