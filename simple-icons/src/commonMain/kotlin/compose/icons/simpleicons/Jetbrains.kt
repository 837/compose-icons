package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Jetbrains: VectorAsset
    get() {
        if (_jetbrains != null) {
            return _jetbrains!!
        }
        _jetbrains = VectorAssetBuilder(name = "Jetbrains", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(2.1f, 21.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-9.0f)
                lineTo(2.1f, 21.0f)
                close()
                moveTo(3.3f, 6.9f)
                horizontalLineToRelative(0.3f)
                curveToRelative(0.7f, -0.1f, 1.2f, -0.7f, 1.2f, -1.5f)
                lineTo(4.8f, 3.0f)
                lineTo(3.7f, 3.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.4f, -0.1f, 0.5f, -0.4f, 0.5f)
                curveToRelative(-0.3f, 0.0f, -0.5f, -0.1f, -0.6f, -0.3f)
                lineToRelative(-0.7f, 0.6f)
                curveToRelative(0.3f, 0.5f, 0.8f, 0.7f, 1.3f, 0.6f)
                close()
                moveTo(8.3f, 6.9f)
                lineTo(8.3f, 6.0f)
                lineTo(6.2f, 6.0f)
                verticalLineToRelative(-0.6f)
                lineTo(8.0f, 5.4f)
                verticalLineToRelative(-0.9f)
                lineTo(6.2f, 4.5f)
                verticalLineToRelative(-0.6f)
                horizontalLineToRelative(2.1f)
                lineTo(8.3f, 3.0f)
                lineTo(5.1f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.2f)
                close()
                moveTo(9.6f, 6.9f)
                horizontalLineToRelative(1.1f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.2f)
                lineTo(11.9f, 3.0f)
                lineTo(8.5f, 3.0f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.6f, 10.7f)
                curveToRelative(0.0f, -0.5f, -0.3f, -0.9f, -0.8f, -0.9f)
                curveToRelative(0.4f, -0.1f, 0.6f, -0.5f, 0.6f, -0.9f)
                curveToRelative(0.0f, -0.2f, -0.1f, -0.5f, -0.2f, -0.7f)
                curveToRelative(-0.3f, -0.3f, -0.7f, -0.4f, -1.1f, -0.4f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.9f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.9f, 0.0f, 1.5f, -0.4f, 1.5f, -1.0f)
                close()
                moveTo(3.1f, 8.7f)
                horizontalLineToRelative(0.7f)
                curveToRelative(0.3f, 0.0f, 0.5f, 0.1f, 0.5f, 0.3f)
                curveToRelative(0.0f, 0.3f, -0.2f, 0.4f, -0.5f, 0.4f)
                horizontalLineToRelative(-0.7f)
                verticalLineToRelative(-0.7f)
                close()
                moveTo(3.1f, 10.8f)
                verticalLineToRelative(-0.7f)
                horizontalLineToRelative(0.8f)
                curveToRelative(0.4f, 0.0f, 0.6f, 0.1f, 0.5f, 0.3f)
                curveToRelative(0.0f, 0.2f, -0.2f, 0.4f, -0.5f, 0.4f)
                horizontalLineToRelative(-0.8f)
                close()
                moveTo(10.5f, 7.8f)
                lineTo(9.0f, 11.3f)
                lineToRelative(-0.6f, -0.9f)
                curveToRelative(0.5f, -0.2f, 0.8f, -0.7f, 0.8f, -1.2f)
                curveToRelative(0.0f, -0.3f, -0.1f, -0.7f, -0.3f, -0.9f)
                curveToRelative(-0.4f, -0.4f, -0.9f, -0.5f, -1.3f, -0.5f)
                lineTo(5.7f, 7.8f)
                verticalLineToRelative(3.9f)
                horizontalLineToRelative(1.1f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(0.5f)
                lineToRelative(0.8f, 1.2f)
                lineTo(9.9f, 11.7f)
                lineToRelative(0.3f, -0.7f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.3f, 0.7f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-1.6f, -4.0f)
                horizontalLineToRelative(-1.1f)
                close()
                moveTo(7.5f, 9.7f)
                horizontalLineToRelative(-0.7f)
                verticalLineToRelative(-0.9f)
                horizontalLineToRelative(0.7f)
                curveToRelative(0.3f, 0.0f, 0.6f, 0.1f, 0.6f, 0.5f)
                curveToRelative(0.0f, 0.2f, -0.2f, 0.4f, -0.6f, 0.4f)
                close()
                moveTo(11.4f, 10.2f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(0.4f, -1.1f)
                lineToRelative(0.4f, 1.1f)
                close()
                moveTo(13.3f, 11.7f)
                horizontalLineToRelative(1.1f)
                lineTo(14.4f, 7.8f)
                horizontalLineToRelative(-1.1f)
                verticalLineToRelative(3.9f)
                close()
                moveTo(17.3f, 9.9f)
                lineToRelative(-1.6f, -2.1f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.9f)
                horizontalLineToRelative(1.1f)
                lineTo(15.8f, 9.6f)
                lineToRelative(1.7f, 2.2f)
                horizontalLineToRelative(0.9f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.1f)
                verticalLineToRelative(2.1f)
                close()
                moveTo(20.4f, 9.3f)
                curveToRelative(-0.5f, -0.1f, -0.7f, -0.2f, -0.7f, -0.4f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.2f, 0.4f, -0.2f)
                curveToRelative(0.4f, 0.0f, 0.8f, 0.2f, 1.1f, 0.4f)
                lineToRelative(0.6f, -0.8f)
                curveToRelative(-0.5f, -0.4f, -1.0f, -0.5f, -1.6f, -0.5f)
                curveToRelative(-0.9f, 0.0f, -1.5f, 0.6f, -1.5f, 1.3f)
                curveToRelative(0.0f, 0.8f, 0.6f, 1.0f, 1.5f, 1.2f)
                curveToRelative(0.5f, 0.1f, 0.7f, 0.2f, 0.7f, 0.4f)
                reflectiveCurveToRelative(-0.2f, 0.3f, -0.5f, 0.3f)
                curveToRelative(-0.5f, 0.0f, -0.9f, -0.2f, -1.3f, -0.5f)
                lineToRelative(-0.6f, 0.7f)
                curveToRelative(0.5f, 0.4f, 1.2f, 0.6f, 1.8f, 0.6f)
                curveToRelative(1.0f, 0.0f, 1.6f, -0.5f, 1.6f, -1.3f)
                curveToRelative(0.0f, -0.7f, -0.6f, -1.0f, -1.5f, -1.2f)
                close()
            }
        }
        .build()
        return _jetbrains!!
    }

private var _jetbrains: VectorAsset? = null