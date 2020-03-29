package best.hyun.pgrc.type.kkomi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kkomi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kkomi)
    override val type: PET_TYPE
        get() = PET_TYPE.KKOMI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kkomi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 45
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1342
    override val maxLvMaxAtk: Int
        get() = 333
    override val maxLvMaxDef: Int
        get() = 191
    override val maxLvMaxSpd: Int
        get() = 243
    override val initLvMinHp: Int
        get() = 34
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1133
    override val maxLvMinAtk: Int
        get() = 294
    override val maxLvMinDef: Int
        get() = 153
    override val maxLvMinSpd: Int
        get() = 211
    override val minAllGrowth: Double
        get() = 4.641
    override val maxAllGrowth: Double
        get() = 5.348
}