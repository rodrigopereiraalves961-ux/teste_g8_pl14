package pt.ul.fc;

/**
 * Uma bola com posição (x, y) e velocidade (vx, vy).
 * Unidades: metros e metros por segundo. O eixo y aponta para cima.
 */
public class Bola {
    private double x;
    private double y;
    private double vx;
    private double vy;

    /**
     * Cria uma bola na posição (x, y) com velocidade (vx, vy).
     */
    public Bola(double x, double y, double vx, double vy) {
        setPosicao(x, y);
        setVelocidade(vx, vy);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }

    public void setPosicao(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setVelocidade(double vx, double vy) {
        this.vx = vx;
        this.vy = vy;
    }

    /**
     * Desloca a bola em linha reta durante dt segundos, com a velocidade atual.
     *
     * @param dt duração do deslocamento, em segundos
     */
    public void mover(double dt) {
        setPosicao(x + vx * dt, y + vy * dt);
    }

    /**
     * Altera a velocidade vertical da bola, sujeita a uma aceleração vertical
     * ay (m/s², positiva para cima) durante dt segundos.
     *
     * @param ay aceleração vertical, em m/s²
     * @param dt duração, em segundos
     */
    public void acelerar(double ay, double dt) {
        vy += ay * dt;
    }
}
