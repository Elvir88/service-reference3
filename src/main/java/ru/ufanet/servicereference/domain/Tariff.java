package ru.ufanet.servicereference.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Tariff.
 */
@Entity
@Table(name = "tariff")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Tariff implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "title", nullable = false)
    private String title;

    @NotNull
    @Column(name = "cost", precision = 21, scale = 2, nullable = false)
    private BigDecimal cost;

    @ManyToOne
    @JsonIgnoreProperties(value = { "tariffs" }, allowSetters = true)
    private TariffGroup tariffGroup;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Tariff id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public Tariff title(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    public Tariff cost(BigDecimal cost) {
        this.setCost(cost);
        return this;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public TariffGroup getTariffGroup() {
        return this.tariffGroup;
    }

    public void setTariffGroup(TariffGroup tariffGroup) {
        this.tariffGroup = tariffGroup;
    }

    public Tariff tariffGroup(TariffGroup tariffGroup) {
        this.setTariffGroup(tariffGroup);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tariff)) {
            return false;
        }
        return id != null && id.equals(((Tariff) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Tariff{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", cost=" + getCost() +
            "}";
    }
}
