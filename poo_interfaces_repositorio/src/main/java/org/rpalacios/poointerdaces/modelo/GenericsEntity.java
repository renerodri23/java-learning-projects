package org.rpalacios.poointerdaces.modelo;

import java.util.Objects;

public class GenericsEntity {
    protected Integer id;
    private static int ultimoId;

    public GenericsEntity() {
        this.id=++ultimoId;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GenericsEntity g = (GenericsEntity) o;
        return Objects.equals(id, g.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
