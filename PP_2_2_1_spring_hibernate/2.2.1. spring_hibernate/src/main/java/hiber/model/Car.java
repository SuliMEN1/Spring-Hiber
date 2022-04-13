package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column
    private String model;

    @Column
    private int series;

    @OneToOne
    @JoinColumn
    private User user;



    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }


    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
