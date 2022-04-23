import com.grailsLearning.UserPasswordEncoderListener
import com.grailsLearning.CustomUserDetailsService
// Place your Spring DSL code here

beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    userDetailsService(CustomUserDetailsService)
}
