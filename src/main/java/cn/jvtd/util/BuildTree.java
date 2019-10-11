package cn.jvtd.util;

import cn.jvtd.domain.SysFunc;

import java.util.ArrayList;
import java.util.List;

public class BuildTree {
    public static SysFunc buildTree(List<SysFunc> nodes) {
        if(nodes == null){
            return null;
        }
        List<SysFunc> topNodes = new ArrayList<SysFunc>();
        for (SysFunc children : nodes) {

            String pid = Tools.trimToEmpty(children.getParentId());
            if (pid == null || "".equals(pid) || "0".equals(pid)) {
                topNodes.add(children);
                continue;
            }
            for (SysFunc parent : nodes) {
                String id = Tools.trimToEmpty(parent.getFuncId());
                if (id != null && id.equals(pid)) {
                    parent.addChild(children);
                    continue;
                }
            }

        }

        SysFunc root = new SysFunc();
        if (topNodes.size() == 1) {
            root = topNodes.get(0);
        } else {
            root.setFuncId("0");
            root.setParentId("-1");
            root.setChildrens(topNodes);
            root.setFuncName("根");

        }
        return root;
    }

}
