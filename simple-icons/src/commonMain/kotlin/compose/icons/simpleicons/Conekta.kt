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

public val SimpleIcons.Conekta: VectorAsset
    get() {
        if (_conekta != null) {
            return _conekta!!
        }
        _conekta = VectorAssetBuilder(name = "Conekta", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 19.502f)
                lineTo(2.7f, 12.0f)
                lineToRelative(5.55f, -7.5f)
                lineToRelative(3.45f, 4.65f)
                lineTo(9.447f, 12.0f)
                lineToRelative(2.25f, 3.0f)
                lineToRelative(-3.45f, 4.502f)
                close()
                moveTo(12.45f, 24.0f)
                lineToRelative(8.85f, -12.0f)
                lineToRelative(-8.85f, -12.0f)
                horizontalLineToRelative(-6.9f)
                lineToRelative(9.0f, 12.0f)
                lineToRelative(-9.0f, 12.0f)
                horizontalLineToRelative(6.9f)
                close()
            }
        }
        .build()
        return _conekta!!
    }

private var _conekta: VectorAsset? = null