package me.blok601.antiipvp;

/**
 * Created by Blok on 7/14/2017.
 */
public enum iPvPType {

    BLOCKBREAK(ChatUtils.format("&cBroke block under player")), SUFFOCATE(ChatUtils.format("&cPlaced Sand or gravel above player")), BURN(ChatUtils.format("Placed Lava or flint and steel"));

    private String message;

     iPvPType(String message){
          this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
