package com.nowakowski.builder;

import com.nowakowski.builder.Cell.CellBuilder;

public class Main {

  public static void main(String[] args) {
    Cell cell = new CellBuilder(CellType.PLANT)
        .chloroplasy()
        .blona_komorkowa()
        .blona_komorkowa()
        .blona_jadrowa()
        .cytoplazma()
        .cytoplazma()
        .retikulim_endoplazmatyczne()
        .rybosomy()
        .rybosomy()
        .mitohondrium()
        .wakuola()
        .lizosomy()
        .build();

    Cell cell1 = new CellBuilder(CellType.ANIMAL)
        .blona_komorkowa()
        .blona_komorkowa()
        .blona_jadrowa()
        .cytoplazma()
        .cytoplazma()
        .retikulim_endoplazmatyczne()
        .rybosomy()
        .rybosomy()
        .mitohondrium()
        .wakuola()
        .lizosomy()
        .build();

    System.out.println(cell);
    System.out.println(cell1);
  }
}
