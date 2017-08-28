package main.java.Enes5519.BasitMesajlar;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import cn.nukkit.utils.ConfigSection;

import java.io.File;
import java.util.LinkedHashMap;

public class BasitMesajlar extends PluginBase{
    
    Config cfg;

    @Override
    public void onEnable(){
        this.getServer().getLogger().info("§6BasitMesajlar §8» §aEklenti aktif!");
        LinkedHashMap<String, Object> hashMap = new LinkedHashMap<>();
        hashMap.put("giris-mesaj","§8» §f{oyuncu} §aoyuna katıldı!");
        hashMap.put("cikis-mesaj","§8» §f{oyuncu} §coyundan ayrıldı!");
        this.cfg = new Config(new File(this.getDataFolder(),"config.yml"), Config.YAML, new ConfigSection(hashMap));
        this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
    }
}
