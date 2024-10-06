import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import java.util.HashMap;
import java.util.Map;

public class CustomRequestWrapper extends ServletRequestWrapper {

    private final Map<String, String> customAttributes;

    public CustomRequestWrapper(ServletRequest request) {
        super(request);
        customAttributes = new HashMap<>();
        customAttributes.put("newAttribute", "Sajeeb");
       String ps = request.getParameter("password");

       if (ps != null){
    customAttributes.put("password", "newPasswordValue");
       }

    }

    @Override
    public String getParameter(String name) {
        // Return the custom attribute as a String or null
        return customAttributes.getOrDefault(name, super.getParameter(name));
    }



    @Override
    public Object getAttribute(String name) {
        Object attribute = customAttributes.get(name);
        if (attribute != null) {
            return attribute; // Return the custom attribute
        }

        Object originalAttribute = super.getAttribute(name);
        return (originalAttribute instanceof String) ? (String) originalAttribute : null; // Safely cast to String
    }








}



