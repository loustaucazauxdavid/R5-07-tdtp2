package com.loustaucazauxdavid.personnage;

public class Personnage {

     enum Direction {
         NORD,
         EST,
         SUD,
         OUEST
     }

      Direction currentDirection = Direction.NORD;

     Personnage (Direction direction) {
         this.currentDirection = direction;
     }

      String tourner(int fois)
      {
          if (!(fois > 0))
          {
              return null;
          }

          int foisNormalized = fois % Direction.values().length - 1;

          currentDirection = Direction.values()[foisNormalized + 1];

          return currentDirection.name();
      }

}
