package com.example.decafe.gameLogic;


import com.example.decafe.utils.ImageHelper;
import javafx.scene.image.ImageView;

import java.io.FileNotFoundException;

// Function used to control all the methods used for Upgrades
public class Upgrade {
    private final int CoinsNeeded; // The coins needed to use/do the Upgrade
    private boolean alreadyUsedOnce; // Boolean that indicates if the Upgrade was already used or not
    private final String filenameUpgradeNotUsed; // Image of "deactivated" Upgrade
    private final String filenameUpgradeUsed; // Image of "activated" Upgrade
    private final ImageView upgradeImageView; // ImageView that is related to the Upgrade

    // Constructor
    Upgrade(int coinsNeeded, boolean alreadyUsedOnce, String filenameUpgradeNotUsed, String filenameUpgradeUsed, ImageView upgradeImageView){
        this.CoinsNeeded = coinsNeeded;
        this.alreadyUsedOnce = alreadyUsedOnce;
        this.filenameUpgradeNotUsed = filenameUpgradeNotUsed;
        this.filenameUpgradeUsed = filenameUpgradeUsed;
        this.upgradeImageView = upgradeImageView;
    }

    // Getter
    public boolean isAlreadyUsedOnce() {
        return alreadyUsedOnce;
    }

    public int getCoinsNeeded() {
        return CoinsNeeded;
    }

    public String getFilenameUpgradeUsed() {
        return filenameUpgradeUsed;
    }

    public String getFilenameUpgradeNotUsed() {
        return filenameUpgradeNotUsed;
    }

    public ImageView getUpgradeImageView() { return upgradeImageView; }

    // Setter
    public void setAlreadyUsedOnce(boolean alreadyUsedOnce) {
        this.alreadyUsedOnce = alreadyUsedOnce;
    }



    // Method used to use an Upgrade
    public int doUpgrades(int coin) throws FileNotFoundException {
        // Change Image to the "deactivated" Upgrade Image
        this.upgradeImageView.setImage(ImageHelper.createImage(this.filenameUpgradeUsed));
        // Disable the ImageView
        this.upgradeImageView.setDisable(true);
        // Set the Used variable to true
        this.setAlreadyUsedOnce(true);
        // Decrease the coins score according to the upgrade costs
        coin -= this.getCoinsNeeded();
        // return the new coin score
        return coin;
    }
}
