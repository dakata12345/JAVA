/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplucolocviu3;

import java.util.Comparator;

/**
 *
 * @author IONESCU
 */
public class FigureComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure a, Figure b) {
        if (a instanceof Dreptunghi) {
            if (b instanceof Dreptunghi) {
                if (((Dreptunghi) a).Area < ((Dreptunghi) b).Area) {
                    return -1;
                }
                if (((Dreptunghi) a).Area > ((Dreptunghi) b).Area) {
                    return 1;
                }
                if (((Dreptunghi) a).Area == ((Dreptunghi) b).Area) {
                    if (((Dreptunghi) a).Perimeter < ((Dreptunghi) b).Perimeter) {
                        return -1;
                    }
                    if (((Dreptunghi) a).Perimeter > ((Dreptunghi) b).Perimeter) {
                        return 1;
                    }
                    return 0;
                }
            }
            if (b instanceof Patrat) {
                if (((Dreptunghi) a).Area < ((Patrat) b).Area) {
                    return -1;
                }
                if (((Dreptunghi) a).Area > ((Patrat) b).Area) {
                    return 1;
                }
                if (((Dreptunghi) a).Area == ((Patrat) b).Area) {
                    if (((Dreptunghi) a).Perimeter < ((Patrat) b).Perimeter) {
                        return -1;
                    }
                    if (((Dreptunghi) a).Perimeter > ((Patrat) b).Perimeter) {
                        return 1;
                    }
                    return 0;
                }
            }
            if (b instanceof Cerc) {
                if (((Dreptunghi) a).Area < ((Cerc) b).area) {
                    return -1;
                }
                if (((Dreptunghi) a).Area > ((Cerc) b).area) {
                    return 1;
                }
                if (((Dreptunghi) a).Area == ((Cerc) b).area) {
                    if (((Dreptunghi) a).Perimeter < ((Cerc) b).lungime) {
                        return -1;
                    }
                    if (((Dreptunghi) a).Perimeter > ((Cerc) b).lungime) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        if (a instanceof Patrat) {
            if (b instanceof Dreptunghi) {
                if (((Patrat) a).Area < ((Dreptunghi) b).Area) {
                    return -1;
                }
                if (((Patrat) a).Area > ((Dreptunghi) b).Area) {
                    return 1;
                }
                if (((Patrat) a).Area == ((Dreptunghi) b).Area) {
                    if (((Patrat) a).Perimeter < ((Dreptunghi) b).Perimeter) {
                        return -1;
                    }
                    if (((Patrat) a).Perimeter > ((Dreptunghi) b).Perimeter) {
                        return 1;
                    }
                    return 0;
                }
            }
            if (b instanceof Patrat) {
                if (((Patrat) a).Area < ((Patrat) b).Area) {
                    return -1;
                }
                if (((Patrat) a).Area > ((Patrat) b).Area) {
                    return 1;
                }
                if (((Patrat) a).Area == ((Patrat) b).Area) {
                    if (((Patrat) a).Perimeter < ((Patrat) b).Perimeter) {
                        return -1;
                    }
                    if (((Patrat) a).Perimeter > ((Patrat) b).Perimeter) {
                        return 1;
                    }
                    return 0;
                }
            }
            if (b instanceof Cerc) {
                if (((Patrat) a).Area < ((Cerc) b).area) {
                    return -1;
                }
                if (((Patrat) a).Area > ((Cerc) b).area) {
                    return 1;
                }
                if (((Patrat) a).Area == ((Cerc) b).area) {
                    if (((Patrat) a).Perimeter < ((Cerc) b).lungime) {
                        return -1;
                    }
                    if (((Patrat) a).Perimeter > ((Cerc) b).lungime) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        if (a instanceof Cerc) {
            if (b instanceof Dreptunghi) {
                if (((Cerc) a).area < ((Dreptunghi) b).Area) {
                    return -1;
                }
                if (((Cerc) a).area > ((Dreptunghi) b).Area) {
                    return 1;
                }
                if (((Cerc) a).area == ((Dreptunghi) b).Area) {
                    if (((Cerc) a).lungime < ((Dreptunghi) b).Perimeter) {
                        return -1;
                    }
                    if (((Cerc) a).lungime > ((Dreptunghi) b).Perimeter) {
                        return 1;
                    }
                    return 0;
                }
            }
            if (b instanceof Patrat) {
                if (((Cerc) a).area < ((Patrat) b).Area) {
                    return -1;
                }
                if (((Cerc) a).area > ((Patrat) b).Area) {
                    return 1;
                }
                if (((Cerc) a).area == ((Patrat) b).Area) {
                    if (((Cerc) a).lungime < ((Patrat) b).Perimeter) {
                        return -1;
                    }
                    if (((Cerc) a).lungime > ((Patrat) b).Perimeter) {
                        return 1;
                    }
                    return 0;
                }
            }
            if (b instanceof Cerc) {
                if (((Cerc) a).area < ((Cerc) b).area) {
                    return -1;
                }
                if (((Cerc) a).area > ((Cerc) b).area) {
                    return 1;
                }
                if (((Cerc) a).area == ((Cerc) b).area) {
                    if (((Cerc) a).lungime < ((Cerc) b).lungime) {
                        return -1;
                    }
                    if (((Cerc) a).lungime > ((Cerc) b).lungime) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return 0;
    }

}
