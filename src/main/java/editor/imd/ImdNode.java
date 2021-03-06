/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor.imd;

import java.util.ArrayList;

/**
 *
 * @author Trifindo
 */
public class ImdNode {
    public String nodeName;
    public ArrayList<ImdAttribute> attributes;
    public String content;
    public ArrayList<ImdNode> subnodes;
    
    public ImdNode(String nodeName){
        this.nodeName = nodeName;
        subnodes = new ArrayList<>();
        attributes = new ArrayList<>();
        content = "";
    }
    
    public ImdAttribute getAttribute(String tag){
        for(ImdAttribute p : attributes){
            if(p.tag.equals(tag)){
                return p;
            }
        }
        return null;
    }
}
