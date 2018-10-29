package com.nowakowski.builder;

public class Cell {

  private CellType cellType;
  private Integer jadro_komorkowe;
  private Integer sciana_komorkowa;
  private Integer blona_komorkowa;
  private Integer blonka_jadrowa;
  private Integer cytoplazma;
  private Integer retikulim_endoplazmatyczne;
  private Integer rybosomy;
  private Integer mitohondrium;
  private Integer wakuola;
  private Integer lizosomy;
  private Integer chloroplasty;

  public Cell(CellType cellType, Integer jadro_komorkowe, Integer sciana_komorkowa,
      Integer blona_komorkowa, Integer blonka_jadrowa, Integer cytoplazma,
      Integer retikulim_endoplazmatyczne, Integer rybosomy, Integer mitohondrium,
      Integer wakuola, Integer lizosomy, Integer chloroplasty) {
    this.cellType = cellType;
    this.jadro_komorkowe = jadro_komorkowe;
    this.sciana_komorkowa = sciana_komorkowa;
    this.blona_komorkowa = blona_komorkowa;
    this.blonka_jadrowa = blonka_jadrowa;
    this.cytoplazma = cytoplazma;
    this.retikulim_endoplazmatyczne = retikulim_endoplazmatyczne;
    this.rybosomy = rybosomy;
    this.mitohondrium = mitohondrium;
    this.wakuola = wakuola;
    this.lizosomy = lizosomy;
    this.chloroplasty = chloroplasty;
  }


  @Override
  public String toString() {
    return "Cell{" +
        "cellType=" + cellType +
        ", jadro_komorkowe='" + jadro_komorkowe + '\'' +
        ", sciana_komorkowa='" + sciana_komorkowa + '\'' +
        ", blona_komorkowa='" + blona_komorkowa + '\'' +
        ", blonka_jadrowa='" + blonka_jadrowa + '\'' +
        ", cytoplazma='" + cytoplazma + '\'' +
        ", retikulim_endoplazmatyczne='" + retikulim_endoplazmatyczne + '\'' +
        ", rybosomy='" + rybosomy + '\'' +
        ", mitohondrium='" + mitohondrium + '\'' +
        ", wakuola='" + wakuola + '\'' +
        ", lizosomy='" + lizosomy + '\'' +
        ", chloroplasty='" + chloroplasty + '\'' +
        '}';
  }

  public static class CellBuilder {

    private CellType cellType;
    private Integer jadro_komorkowe;
    private Integer sciana_komorkowa = 0;
    private Integer blona_komorkowa = 0;
    private Integer blonka_jadrowa = 0;
    private Integer cytoplazma = 0;
    private Integer retikulim_endoplazmatyczne = 0;
    private Integer rybosomy = 0;
    private Integer mitohondrium = 0;
    private Integer wakuola = 0;
    private Integer lizosomy = 0;
    private Integer chloroplasty = 0;

    public CellBuilder(final CellType cellType) {
      this.cellType = cellType;
      if (cellType.equals(CellType.PLANT)) {
        this.jadro_komorkowe = 1;
        this.sciana_komorkowa = 1;
      } else {
        this.jadro_komorkowe = 1;
      }
    }

    public CellBuilder blona_komorkowa() {
      this.blona_komorkowa++;
      return this;
    }

    public CellBuilder blona_jadrowa() {
      this.blonka_jadrowa++;
      return this;
    }

    public CellBuilder cytoplazma() {
      this.cytoplazma++;
      return this;
    }

    public CellBuilder retikulim_endoplazmatyczne() {
      this.retikulim_endoplazmatyczne++;
      return this;
    }

    public CellBuilder rybosomy() {
      this.rybosomy++;
      return this;
    }

    public CellBuilder mitohondrium() {
      this.mitohondrium++;
      return this;
    }

    public CellBuilder wakuola() {
      this.wakuola++;
      return this;
    }

    public CellBuilder lizosomy() {
      this.lizosomy++;
      return this;
    }

    public CellBuilder chloroplasy() {
      if (cellType.equals(CellType.PLANT)) {
        this.chloroplasty++;
        return this;
      }
      return this;
    }

    public Cell build() {
      return new Cell(cellType, jadro_komorkowe, sciana_komorkowa, blona_komorkowa, blonka_jadrowa,
          cytoplazma, retikulim_endoplazmatyczne, rybosomy, mitohondrium, wakuola, lizosomy,
          chloroplasty);
    }
  }
}
