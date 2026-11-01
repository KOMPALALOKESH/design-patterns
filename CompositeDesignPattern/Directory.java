package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystemComponent {
    private String name;
    private List<IFileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(IFileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (IFileSystemComponent component : components) {
            component.showDetails();
        }
    }

}
