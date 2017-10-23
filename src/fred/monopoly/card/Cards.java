/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.card;

/**
 *
 * @author fsr19
 */
public interface Cards {
    
    /**
     * Position is 0 indexed
     */
    DeedCard[] DEED_CARDS = {
        new PropertyCard(1, 60, 30, "OLD KENT ROAD", 50, new int[] { 2, 10, 30, 90, 160, 250 }),
        new PropertyCard(3, 60, 30, "WHITECHAPEL ROAD", 50, new int[] { 2, 10, 30, 90, 160, 250 }),
        
        new StationCard(5, 200, 100, "KINGS CROSS STATION", new int[] { 25, 50, 100, 200}),
        
        new PropertyCard(6, 100, 50, "THE ANGEL, ISLINGTON", 50, new int[] { 6, 30, 90, 270, 400, 550 }),
        new PropertyCard(8, 100, 50, "EUSTON ROAD", 50, new int[] { 6, 30, 90, 270, 400, 550 }),
        new PropertyCard(9, 120, 60, "PENTONVILLE ROAD", 50, new int[] { 6, 40, 100, 300, 450, 600 }),
        
        new PropertyCard(11, 140, 70, "PALL MALL", 100, new int[] { 10, 50, 150, 450, 625, 750 }),
        
        new UtilityCard(12, 150, 75, "ELECTRIC COMPANY", 4, 10),
        
        new PropertyCard(13, 140, 70, "WHITEHALL", 100, new int[] { 10, 50, 150, 450, 625, 750 }),
        new PropertyCard(14, 160, 80, "NORTHUMRL'D AVENUE", 100, new int[] { 12, 60, 180, 500, 700, 900 }),
        
        new StationCard(15, 200, 100, "MARYLEBONE STATION", new int[] { 25, 50, 100, 200}),
        
        new PropertyCard(16, 180, 90, "BOW STREET", 100, new int[] { 14, 70, 200, 550, 700, 900 }),
        new PropertyCard(18, 180, 90, "MARLBOROUGH STREET", 100, new int[] { 14, 70, 200, 550, 700, 900 }),
        new PropertyCard(19, 200, 100, "VINE STREET", 100, new int[] { 16, 80, 220, 600, 800, 1000 }),
        
        new PropertyCard(21, 220, 110, "STRAND", 150, new int[] { 18, 90, 250, 700, 875, 1050 }),
        new PropertyCard(23, 220, 110, "FLEET STREET", 150, new int[] { 18, 90, 250, 700, 875, 1050 }),
        new PropertyCard(24, 240, 120, "TRAFALGAR SQUARE", 150, new int[] { 20, 100, 300, 750, 925, 1100 }),
        
        new StationCard(25, 200, 100, "FENCHURCH ST. STATION", new int[] { 25, 50, 100, 200}),
        
        new PropertyCard(26, 260, 130, "LEICESTER SQUARE", 150, new int[] { 22, 110, 330, 800, 975, 1150 }),
        new PropertyCard(27, 260, 130, "COVENTRY STREET", 150, new int[] { 22, 110, 330, 800, 975, 1150 }),
        
        new UtilityCard(28, 150, 75, "WATER WORKS", 4, 10),
        
        new PropertyCard(29, 280, 140, "PICCADILLY", 150, new int[] { 24, 120, 360, 850, 1025, 1200 }),
        
        new PropertyCard(31, 300, 150, "REGENT STREET", 200, new int[] { 26, 130, 390, 900, 1100, 1275 }),
        new PropertyCard(32, 300, 150, "OXFORD STREET", 200, new int[] { 26, 130, 390, 900, 1100, 1275 }),
        new PropertyCard(34, 320, 160, "BOND STREET", 200, new int[] { 28, 150, 450, 1000, 1200, 1400 }),
        
        new StationCard(35, 200, 100, "LIVERPOOL ST. STATION", new int[] { 25, 50, 100, 200}),
        
        new PropertyCard(37, 350, 175, "REGENT STREET", 200, new int[] { 35, 176, 500, 1100, 1300, 1500 }),
        new PropertyCard(39, 400, 200, "OXFORD STREET", 200, new int[] { 50, 200, 600, 1400, 1700, 2000 })
    };
    
    
    
}
