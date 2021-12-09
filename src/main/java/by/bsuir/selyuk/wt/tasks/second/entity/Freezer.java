package by.bsuir.selyuk.wt.tasks.second.entity;

import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;

import java.util.Objects;
/**
 * Freezer class with properties <b>price</b>, <b>freezerCapacity</b>,
 * <b>width</b>, <b>height</b>, <b>depth</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Freezer extends Appliance {
    /**
     * Field depth of{@link Freezer}
     */
    private double depth;
    /**
     * Field height of{@link Freezer}
     */
    private double height;
    /**
     * Field width of{@link Freezer}
     */
    private double width;
    /**
     * Field freezerCapacity of{@link Freezer}
     */
    private double freezerCapacity;

    /**
     * {@link SearchCriteria.Freezer} constructor with parameters
     *
     * @param price               price
     * @param freezerCapacity     freezer capacity
     * @param depth               depth
     * @param width               width
     * @param height              height}
     */
    public Freezer(double price,double depth,double height, double width, double freezerCapacity){
        super(price);
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.freezerCapacity = freezerCapacity;
    }

    /**
     * Gets freezerCapacity value
     * @return freezerCapacity
     */
    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    /**
     * Gets width value
     * @return width
     */
    public double getWidth() {
        return width;
    }
    /**
     * Gets depth value
     * @return depth
     */
    public double getDepth() {
        return depth;
    }
    /**
     * Gets height value
     * @return height
     */
    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Freezer freezer = (Freezer) o;
        return freezerCapacity == freezer.freezerCapacity && Double.compare(freezer.depth, depth) == 0 && Double.compare(freezer.height, height) == 0 && Double.compare(freezer.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freezerCapacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Freezer{" +
                "price=" + super.getPrice() +
                ", freezer capacity=" + freezerCapacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

}
