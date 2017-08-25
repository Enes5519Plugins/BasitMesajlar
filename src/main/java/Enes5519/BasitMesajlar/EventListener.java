package main.java.Enes5519.BasitMesajlar;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;

class EventListener implements Listener {

    private BasitMesajlar plugin;

    EventListener(BasitMesajlar basitmesajlar) {
        this.plugin = basitmesajlar;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void oyunaGiris(PlayerJoinEvent e){
        String mesaj = String.valueOf(this.plugin.cfg.get("giris-mesaj"));
        mesaj = mesaj.replace("{oyuncu}", e.getPlayer().getName());
        e.setJoinMessage(mesaj);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void oyundanCikis(PlayerQuitEvent e){
        String mesaj = String.valueOf(this.plugin.cfg.get("cikis-mesaj"));
        mesaj = mesaj.replace("{oyuncu}", e.getPlayer().getName());
        e.setQuitMessage(mesaj);
    }
}
