/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor.narc2;


public class NarcFile {

    private String name = "";
    private NarcFolder parent;
    private byte[] data;

    public NarcFile(String name, NarcFolder parent) {
        this.name = name;
        this.parent = parent;
    }

    public NarcFile(String name, NarcFolder parent, byte[] data) {
        this.name = name;
        this.parent = parent;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public byte[] getData() {
        return data;
    }
    
}
