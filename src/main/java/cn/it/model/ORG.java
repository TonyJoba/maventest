package cn.it.model;

public class ORG {
    private String id;//组织机构ID
    private String name;//组织机构名称
    private String type_id;//类型ID
    private String parent_id;//上级组织机构
    private String top_parent_id;//顶级组织机构
    private String attr1;//备用字段1
    private String attr2;//备用字段2
    private String attr3;//备用字段3

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public void setTop_parent_id(String top_parent_id) {
        this.top_parent_id = top_parent_id;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public String getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getType_id() {
        return type_id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public String getTop_parent_id() {
        return top_parent_id;
    }

    public String getAttr1() {
        return attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public String getAttr3() {
        return attr3;
    }
}
