package utils.passwordGenerator;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PasswordPolicy {
    private boolean useLower;
    private boolean useUpper;
    private boolean useDigits;
    private boolean usePunctuation;
    private int length;
}
