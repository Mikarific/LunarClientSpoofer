package me.levidevs.lunarclientspoofer;

import com.google.common.eventbus.EventBus;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import me.levidevs.lunarclientspoofer.mapper.Mapper;
import me.levidevs.lunarclientspoofer.mapper.Mapper17;
import me.levidevs.lunarclientspoofer.mapper.Mapper18;

import java.util.Collections;
import java.util.logging.Logger;

/**
 * @author Levi Taylor
 * @since 04/05/2020
 * Represents the container (main) mod class.
 */
public class LunarClientSpoofer extends DummyModContainer {

    /* Instance handling */

    private static LunarClientSpoofer instance;

    public LunarClientSpoofer() {
        super(new ModMetadata());

        if (instance != null) {
            throw new IllegalStateException("Mod main class already initialized!");
        }

        instance = this;

        ModMetadata meta = super.getMetadata();

        meta.modId = "LunarClientSpoofer";
        meta.name = "Lunar Client Spoofer";
        meta.version = "1.0.1-BETA";
        meta.authorList = Collections.singletonList("Levi Taylor");
        meta.url = "https://github.com/LeviDevs/LunarClientSpoofer";
        meta.updateUrl = meta.url;
        meta.description = "Makes servers using a public Lunar Client API think you're using Lunar Client.";
    }

    public static LunarClientSpoofer getInstance() {
        return instance;
    }

    /* Mapper */
    private Mapper mapper;

    public Mapper getMapper() {
        return this.mapper;
    }

    /* Logging */

    private final Logger logger = Logger.getLogger("LunarClientSpoofer");

    public Logger getLogger() {
        return this.logger;
    }

    /* Setup */

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        bus.register(this);

        // Init mapper
        // We do this by trying to find class "bjb" - if it can't be found, then we default to 1.8
        try {
            Class.forName("bjb");
            this.mapper = new Mapper17();
        } catch (ClassNotFoundException e) {
            this.mapper = new Mapper18();
        }

        return true;
    }

}
