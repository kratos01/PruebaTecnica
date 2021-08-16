package com.jaimetorres.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class MuseoObraPk implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Museo museo;
	
	@ManyToOne
	private Obra obra;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((museo == null) ? 0 : museo.hashCode());
		result = prime * result + ((obra == null) ? 0 : obra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MuseoObraPk other = (MuseoObraPk) obj;
		if (museo == null) {
			if (other.museo != null)
				return false;
		} else if (!museo.equals(other.museo))
			return false;
		if (obra == null) {
			if (other.obra != null)
				return false;
		} else if (!obra.equals(other.obra))
			return false;
		return true;
	}
	
	
}
